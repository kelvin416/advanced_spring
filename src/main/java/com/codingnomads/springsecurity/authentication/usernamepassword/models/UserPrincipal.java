/* CodingNomads (C)2024 */
package com.codingnomads.springsecurity.authentication.usernamepassword.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;
import lombok.*;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "users")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPrincipal implements UserDetails {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    @JsonIgnore
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_authority_join_table",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "authority_id"))
    private List<Authority> authorities;

    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean enabled;

    public UserPrincipal(String username, String password, List<Authority> authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
        accountNonExpired = true;
        accountNonLocked = true;
        credentialsNonExpired = true;
        enabled = true;
    }
}
