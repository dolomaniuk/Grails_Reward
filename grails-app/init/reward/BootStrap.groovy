package reward

class BootStrap {

    def init = { servletContext ->
        new Product(name: "Morning Blend", sku: "MB01", price: 14.95).save()
        new Product(name: "Lunch Blend", sku: "LB01", price: 12.95).save()
        new Product(name: "Evening Blend", sku: "EB01", price: 15.35).save()
        new Customer(phone: 8015551201, firstName: "Luther", lastName: "Allison", totalPoints: 1).save()
        new Customer(phone: 8015551202, firstName: "Mark", lastName: "Chervanova", totalPoints: 2).save()
        new Customer(phone: 8015551203, firstName: "Dominik", lastName: "Ivanesku", totalPoints: 3).save()
        new Customer(phone: 8015551204, firstName: "Vasja", lastName: "Genshelʹ", totalPoints: 4).save()
        new Customer(phone: 8015551205, firstName: "Petja", lastName: "Iglakov", totalPoints: 5).save()
        new Customer(phone: 8015551206, firstName: "Martin", lastName: "Ungurʹyan", totalPoints: 5).save()
        new Customer(phone: 8015551207, firstName: "Dima", lastName: "Odoyeva", totalPoints: 4).save()
        new Customer(phone: 8015551208, firstName: "Max", lastName: "Panait", totalPoints: 3).save()
        new Customer(phone: 8015551209, firstName: "Roma", lastName: "Onitsuk", totalPoints: 2).save()
        new Customer(phone: 8015551210, firstName: "Michel", lastName: "Ivashkhov", totalPoints: 1).save()
        new Customer(phone: 8015551211, firstName: "Nikolay", lastName: "Vabulʹnek", totalPoints: 1).save()
        new Customer(phone: 8015551212, firstName: "Oleg", lastName: "Zhirnyakov", totalPoints: 2).save()
        new Customer(phone: 8015551213, firstName: "Boris", lastName: "Zorkova", totalPoints: 3).save()
        new Customer(phone: 8015551214, firstName: "Emelja", lastName: "Drachennikov", totalPoints: 4).save()
        new Customer(phone: 8015551215, firstName: "Stas", lastName: "Artamonin", totalPoints: 5).save()
        new Customer(phone: 8015551216, firstName: "David", lastName: "Sufiyarov", totalPoints: 4).save()
    }
    def destroy = {
    }
}
