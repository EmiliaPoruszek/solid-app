package com.resi_tech.solidapp

import com.resi_tech.solidapp.srp.User
import com.resi_tech.solidapp.srp.correct.Logger
import com.resi_tech.solidapp.srp.correct.UserManager
import org.junit.Test
import org.mockito.Mockito

class UserManagerTest {
  @Test
  fun testAddUser() {
    val logger = Mockito.spy(Logger::class.java)
    val userManager = UserManager(logger)
    val user = User(1, "John Doe", "john.doe@example.com")
    userManager.addUser(user)
    assert(userManager.users.contains(user))
    assert(userManager.users.size == 1)
    Mockito.verify(logger, Mockito.times(1)).log("User John Doe has been added")
  }
}