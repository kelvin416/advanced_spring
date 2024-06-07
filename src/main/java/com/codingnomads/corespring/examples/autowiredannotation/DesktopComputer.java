/* CodingNomads (C)2024 */
package com.codingnomads.corespring.examples.autowiredannotation;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ToString
public class DesktopComputer {

    @Autowired
    @Qualifier("radeon") private VideoCard videoCard;
}
