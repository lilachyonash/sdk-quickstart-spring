package yonash.lilach.sdkquickstartspring.consumer;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodOrderRepository extends CassandraRepository<FoodOrder, Long> {
}

