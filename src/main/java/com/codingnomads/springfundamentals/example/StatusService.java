/* CodingNomads (C)2024 */
package com.codingnomads.springfundamentals.example;

import org.springframework.stereotype.Service;

@Service
public class StatusService {

    public String processStatus(boolean arriving) {
        if (arriving) {
            return "springfundamentals/hello";
        } else {
            return "springfundamentals/goodbye";
        }
    }

    public String processSuccess(){
        return "springfundamentals/success";
    }
}
