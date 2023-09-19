package com.tutorial.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.websocket.OnClose;
import java.util.Date;

@Data
@Entity
@Builder
@Table(name = "branch")
@AllArgsConstructor
@NoArgsConstructor
public class Branch {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "branch_id", nullable = false)
    private Long branchId;

    @Basic
    @Column(name = "branch_name", nullable = false)
    private String branchName;

    @Basic
    @Column(name = "location", nullable = false)
    private String location;

    @Basic
    @Column(name = "product", nullable = false)
    private String product;

    @Basic
    @Column(name = "truck_number", nullable = false)
    private int truckNumber;

    @Basic
    @Column(name = "date_created", nullable = false)
    private Date dateCreated;

}
