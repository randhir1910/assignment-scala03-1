package edu.knoldus

@SerialVersionUID(Constant.personUID)
class Person(firstName: String, lastName: String, @transient age: Int, address: Address) {

  override def toString: String = firstName + "  " + lastName + " " + age + " " + address.streetAddress + " " + address.city + " " + address.postalCode
}

@SerialVersionUID(Constant.addressUID)
class Address(val streetAddress: String, val city: String, val postalCode: Int) {
}
