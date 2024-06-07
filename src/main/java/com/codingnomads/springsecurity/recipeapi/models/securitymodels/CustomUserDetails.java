/* CodingNomads (C)2024 */
package com.codingnomads.springsecurity.recipeapi.models.securitymodels;

import com.codingnomads.springsecurity.recipeapi.models.UserMeta;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import lombok.*;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Getter
@Setter
// @Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomUserDetails implements UserDetails {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    public String username;

    @Column(nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Column(nullable = false)
    private boolean isAccountNonExpired = true;

    @Column(nullable = false)
    private boolean isAccountNonLocked = true;

    @Column(nullable = false)
    private boolean isCredentialsNonExpired = true;

    @Column(nullable = false)
    private boolean isEnabled = true;

    public CustomUserDetails(String username, String password, Collection<Role> authorities, UserMeta userMeta) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
        this.userMeta = userMeta;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", nullable = false)
    private Collection<Role> authorities = new ArrayList<>();

    @OneToOne(cascade = CascadeType.PERSIST, optional = false)
    private UserMeta userMeta;
}
