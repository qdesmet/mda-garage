package tech.becoming.mda.one.anemic;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
public class Place {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @JoinColumn
    private String password;
}
