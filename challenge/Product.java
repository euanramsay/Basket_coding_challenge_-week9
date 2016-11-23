package challenge;

import java.util.Collections;

public class Product {
  private String name;
  private double cost;
  private boolean bogof;

  public Product(String name, double cost, boolean bogof){
    this.name = name;
    this.cost = cost;
    this.bogof = bogof;
  }

  public String getName() {
    return name;
  }

  public double getCost() {
    return cost;
  }

  public boolean getIsBogof() {
    return bogof;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public void setIsBogof(boolean bogof) {
    this.bogof = bogof;
  }



}