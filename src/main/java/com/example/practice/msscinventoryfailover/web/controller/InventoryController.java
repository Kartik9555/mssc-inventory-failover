package com.example.practice.msscinventoryfailover.web.controller;

import com.example.practice.msscinventoryfailover.model.BeerInventoryDto;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory-failover")
public class InventoryController {

    @GetMapping
    public ResponseEntity<List<BeerInventoryDto>> getInventory() {
        BeerInventoryDto beerInventoryDto = BeerInventoryDto.builder()
            .id(UUID.randomUUID())
            .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
            .createdDate(OffsetDateTime.now())
            .lastModifiedDate(OffsetDateTime.now())
            .quantityOnHand(999)
            .build();
        return ResponseEntity.ok(List.of(beerInventoryDto));
    }
}
