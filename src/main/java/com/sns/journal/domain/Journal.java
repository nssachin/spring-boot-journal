package com.sns.journal.domain;

import lombok.*;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Journal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Date created;
    private String summary;

    @Transient
    @Setter(AccessLevel.NONE) @Getter(AccessLevel.NONE)
    private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

    public Journal(String title, String summary, String date) throws ParseException {
        this.title = title;
        this.summary = summary;
        this.created = format.parse(date);
    }

    public String getShortDate() {
        return format.format(created);
    }

    @Override
    public String toString() {
        return new StringBuilder("Journal{")
                .append("id=").append(id)
                .append(", title='").append(title)
                .append('\'').append(", created=").append(getShortDate())
                .append(", summary='").append(summary)
                .append('\'').append('}')
                .toString();
    }
}
