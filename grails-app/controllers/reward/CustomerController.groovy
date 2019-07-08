package reward

class CustomerController {

    def calculationsService

    def lookup() {
        def customerInstance = Customer.findAllByFirstNameIlikeAndTotalPointsGreaterThanEquals("d%", 2)
//        def customerInstance = Customer.findAllByFirstNameAndTotalPoints("Max", 3)
//        def customerInstance = Customer.findAllByTotalPointsBetween(2,4, [sort: "totalPoints"])
//        def customerInstance = Customer.findAllByTotalPointsGreaterThanEquals(3, [sort: "totalPoints", order: "desc"])
//        def customerInstance = Customer.findAllByLastNameIlike("i%") // начинается на ... не зависит от регистра
//        def customerInstance = Customer.findByPhone(params.id)
//        def customerInstance = Customer.findAllByTotalPoints(5, [sort: "lastName"])
//        def customerInstance = Customer.list(sort: "lastName", order: "asc", max: 20, offset: 0)
//        [customerInstanceList: customerInstance]
    }

    def customerLookup(Customer lookupInstance){
        def (customer, welcomeMessage)= calculationsService.processCheckin(lookupInstance)
        render(view: "checkin", model:[customer: customer, welcomeMessage: welcomeMessage])
        // Query customer by phone #
        // If no result,
        // Create a new customer
        // Create welcome message
        // Add award record
        // Save customer
        // Send welcome to kiosk
        // If customer found,
        // Calculate total points
        // Create welcome message
        // Add award record
        // Save customer
        // Send welcome to kiosk
    }

    def checkin() {}

    def index(){
        [customerList: Customer.list(), customerCount: Customer.count()]
    }

    def create() {
        [customer: new Customer()]
    }

    def save(Customer customer) {
        customer.save()
        redirect(action: "show", id: customer.id)
    }

    def show(Long id) {
        def customer = Customer.get(id)
        customer = calculationsService.getTotalPoints(customer)
        [customer: customer]
    }

    def edit(Long id) {
        def customer = Customer.get(id)
        [customer: customer]
    }

    def update(Long id) {
        def customer = Customer.get(id)
        customer.properties = params
        customer.save()
        redirect(action: "show", id: customer.id)
    }

    def delete(Long id) {
        def customer = Customer.get(id)
        customer.delete()
        redirect(action: "index")
    }

    def profile() {
        def customer = Customer.findByPhone(params.id)
        [customer: customer]
    }

    def updateProfile(Customer customer) {
        customer.save()
        redirect(action: "profile", id: customer.phone)
    }
}
