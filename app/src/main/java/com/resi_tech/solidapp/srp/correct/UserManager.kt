package com.resi_tech.solidapp.srp.correct

import com.resi_tech.solidapp.srp.User

/**
 * This class follows the Single Responsibility Principle, because
 * it has only one reason to change: if the user management logic changes.
 */
class UserManager(private val logger: Logger) {
  val users = mutableListOf<User>()

  fun addUser(user: User) {
    users.add(user)
    logger.log("User ${user.name} has been added")
  }
}