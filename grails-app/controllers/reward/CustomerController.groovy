package reward

class CustomerController {
//    static scaffold = Customer

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

    def checkin() {}

    def index(){
        [customerList: Customer.list(), customerCount: Customer.count()]
    }

    def create() {
        [customer: new Customer()]
    }

    def save(Customer customerInstance) {
        customerInstance.save()
        redirect(action: "show", id: customerInstance.id)
    }

    def show(Long id) {
        def customer = Customer.get(id)
        [customer: customer]
    }

    def edit(Long id) {

    }
}
