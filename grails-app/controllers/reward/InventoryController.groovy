package reward

class InventoryController {

    def index() {
        render "Here is a list of everything"
    }

    def edit() {
        def productName = "breakfast Blend"
        def sku = "BB01"
        [product: productName, sku: sku]
    }
    def remove() {
        render "You have one less  than before"
    }

    def list() {
        def allProducts = Product.list()
        [allProducts: allProducts]
    }
}
