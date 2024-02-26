package com.resi_tech.solidapp

import com.resi_tech.solidapp.srp.User
import com.resi_tech.solidapp.srp.correct.UserManager
import org.junit.Test

class UserManagerTest {
  @Test
  fun testAddUser() {
    val userManager = UserManager()
    val user = User(1, "John Doe", "john.doe@example.com")
    userManager.addUser(user)
    assert(userManager.users.contains(user))
    assert(userManager.users.size == 1)
  }
}