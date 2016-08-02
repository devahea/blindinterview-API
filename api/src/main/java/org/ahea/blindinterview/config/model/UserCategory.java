package org.ahea.blindinterview.config.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.ahea.blindinterview.config.ColumnSize;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@NoArgsConstructor
public class UserCategory {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "user_category_id", length = ColumnSize.ID)
  private String id;

  @Column(name = "category_group_id", length = ColumnSize.ID)
  private String categoryGroupId;

  @ManyToOne
  @JoinColumn(name = "user_no", insertable = false, updatable = false)
  private User user;

//  @OneToMany(mappedBy = "userCategory", fetch = FetchType.LAZY)
//  private Set<CategorySharp> categorySharp = new HashSet<CategorySharp>();
}