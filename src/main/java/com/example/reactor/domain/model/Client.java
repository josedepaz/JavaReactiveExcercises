package com.example.reactor.domain.model;


public class Client {

  private String id;
  private String name;

  public Client(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return "Client [" + this.id + " |" + this.name + "]";
  }
}
