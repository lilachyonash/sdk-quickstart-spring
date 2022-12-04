package yonash.lilach.sdkquickstartspring.consumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class FoodOrder {

    @Column
    private Long id;
    @PrimaryKeyColumn(name = "item", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String item;
    @Column
    private Double amount;
}
