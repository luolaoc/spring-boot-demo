package org.luolaoc.demo.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ApplicationProperty {
    @Value("${application.name}")
    private String name;

    @Value("${application.version}")
    private String version;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"name\":\"");
        sb.append(this.name + "\"");
        sb.append(",");
        sb.append("\"version\":\"");
        sb.append(this.version + "\"");
        sb.append("}");
        return sb.toString();
    }
}