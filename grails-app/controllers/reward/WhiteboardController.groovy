package reward

class WhiteboardController {
    def calculationsService

    def index() { }

    def variables() {
        def myTotal = 1
        render("</br>Total: " + myTotal)
        render("</br>" + myTotal.class)
        myTotal = myTotal + 1
        render("</br>New Total: " + myTotal + "</br>")

        def firstName = "Dmitry"
        render("</br>Name: " + firstName)
        render("</br>" + firstName.class)
        firstName = firstName + 1
        render("</br>New Total: " + firstName + "</br>")

        def today = new Date()
        render("</br>Today is: " + today)
        render("</br>" + today.class)
        today = today + 1
        render("</br>New Total: " + today + "</br>")
    }
    def strings() {
        def first = "Dmitry"
        def last = "Dolomaniuk"
        def fullName = "Dmitry Dolomaniuk"
        def input = "SHOUTING"
        def state = "ut"
        def points = 4
        render "Today is ${new Date()}."
        render "</br> Your string, $fullName, has ${fullName.length()} characters in length."
        render "</br>Please stop ${input.toLowerCase()}!"
        render "</br>You live in ${state.toUpperCase()}."
    }

    def conditions() {
        def welcomeMessage = calculationsService.welcome(params)
        render welcomeMessage
    }
}
