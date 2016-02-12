package springbootstrap.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by rupam.ghosh on 11/07/15.
 */

@Entity
@Table(name = "events")
@JsonAutoDetect
public class Event implements Serializable{

    @JsonProperty
    @Id
    Long id;

    @JsonProperty
    @Column
    String entityName;

    @JsonProperty
    @Column
    String context;

    @JsonProperty
    @Column
    String groupId;

    @JsonProperty
    @Column
    String headers;

    @JsonProperty
    @Column
    String status;

    @JsonProperty
    @Column
    DateTime processedAt;

    @JsonProperty
    @Column
    DateTime createdAt;

    @JsonProperty
    @Column
    DateTime updatedAt;

    @JsonProperty
    @Column
    DateTime lastPickedAt;

    @JsonProperty
    @Column
    String ackInfo;
}
