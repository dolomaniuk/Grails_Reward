package reward

class WhiteboardController {

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
        def points = 4
        render "Hey there $first. You already have $points points."
    }
}
