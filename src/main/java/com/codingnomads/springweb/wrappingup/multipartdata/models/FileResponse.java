/* CodingNomads (C)2024 */
package com.codingnomads.springweb.wrappingup.multipartdata.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FileResponse {

    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;
}
