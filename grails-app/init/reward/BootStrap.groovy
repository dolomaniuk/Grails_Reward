package reward

class BootStrap {

    def init = { servletContext ->
        new Product(name: "Morning Blend", sku: "MB01", price: 14.95).save()
        new Product(name: "Lunch Blend", sku: "LB01", price: 12.95).save()
        new Product(name: "Evening Blend", sku: "EB01", price: 15.35).save()
    }
    def destroy = {
    }
}
