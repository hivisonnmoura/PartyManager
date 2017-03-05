package com.hnmoura.studies.repository;

import com.hnmoura.studies.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hivisonmoura on 2017-03-02.
 */
public interface Guests extends JpaRepository<Guest, Long>{

}
