package edu.knoldus

@SerialVersionUID(2020)
class Person(firstName: String, lastName: String, @transient age: Int = 0, val salary: Int, address: Address) {

  override def toString: String = firstName + "  " + lastName + " " + age + " " + address.streetAddress + " " + address.city + " " + address.postalCode
}

@SerialVersionUID(1993)
class Address(val streetAddress: String, val city: String, val postalCode: Int) {
}
