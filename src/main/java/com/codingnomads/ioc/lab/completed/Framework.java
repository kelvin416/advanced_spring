/* CodingNomads (C)2024 */
package com.codingnomads.ioc.lab.completed;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class Framework {
    private String name;
    private String version;
}