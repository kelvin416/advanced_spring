/* CodingNomads (C)2024 */
package com.codingnomads.springsecurity.authentication.usernamepassword.repositories;

import com.codingnomads.springsecurity.authentication.usernamepassword.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepo extends JpaRepository<Authority, Long> {}
