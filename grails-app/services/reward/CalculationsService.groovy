package reward

import grails.gorm.transactions.Transactional

@Transactional
class CalculationsService {

    def processCheckin(lookupInstance) {
        // lookup customer by phone number
        def customer = Customer.findByPhone(lookupInstance.phone)

        // set up new customer
        if (customer == null) {
            customer = lookupInstance
            customer.firstName = "Customer"
        }

        // calculate current award points
        def totalAwards = 0
        customer.awards.each {
            totalAwards = totalAwards + it.points
        }
        customer.totalPoints = totalAwards

        // create welcome message
        def welcomeMessage = ""
        switch (totalAwards) {
            case 5:
                welcomeMessage = "Welcome back $customer.firstName, this drink is on us."
                break
            case 4:
                welcomeMessage = "Welcome back $customer.firstName, your next drink is free."
                break
            case 1..3:
                welcomeMessage = "Welcome back $customer.firstName, you now have ${totalAwards + 1} points."
                break
            default:
                welcomeMessage = "Welcome back $customer.firstName. Thanks fo registering."
                break
        }

        // add new award
        if (totalAwards < 5) {
            customer.addToAwards(new Award(awardDate: new Date(), type: "Purchase", points: 1))
        } else {
            customer.addToAwards(new Award(awardDate: new Date(), type: "Reward", points: -5))
        }

        // save cutomer
        customer.save()

        return [customer, welcomeMessage]
    }

    def welcome(params) {
        def firstName = params.first
        def totalPoints = params.points.toInteger()
        def welcomeMessage = ""
    }

    def getTotalPoints(customer){
        def totalAwards = 0
        customer.awards.each{
            totalAwards = totalAwards + it.points
        }
        customer.totalPoints = totalAwards
        return customer
    }
}
