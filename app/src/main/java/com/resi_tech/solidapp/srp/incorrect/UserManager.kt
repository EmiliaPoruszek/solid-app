package com.resi_tech.solidapp.srp.incorrect

import com.resi_tech.solidapp.srp.User

/**
 * This class violates the Single Responsibility Principle, because
 * it has two reasons to change: if the user management logic changes,
 * or if the logging logic changes.
 */
class UserManager {
  val users = mutableListOf<User>()

  fun addUser(user: User) {
    users.add(user)
    log(user)
  }

  private fun log(user: User) {
    println("User ${user.name} has been added")
  }
}