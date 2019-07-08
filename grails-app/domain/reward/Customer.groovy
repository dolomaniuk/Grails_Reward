package reward

class Customer {
    String firstName
    String lastName
    Long phone
    String email
    Integer totalPoints
    static hasMany = [awards:Award, orders:OnlineOrder]

    static constraints = {
        firstName(nullable: true, maxSize: 70)
        lastName(nullable: true, maxSize: 70)
        phone()
        email(nullable: true, email: true)
        totalPoints(nullable: true, max: 10)
    }
}
