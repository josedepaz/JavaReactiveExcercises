package com.example.reactor.domain.usecase;

import com.example.reactor.domain.model.Client;
import reactor.core.publisher.Flux;
import java.util.ArrayList;
import java.util.List;

public class ClientUseCase {

  public ClientUseCase() {

  }

  public Flux<Client> getClients(int size) {

    return Flux.fromIterable(createClients(size));
  }

  private List<Client> createClients(int size) {
    List<Client> clients = new ArrayList<>();
    for (int x=0; x <= size; x++) {
      String id = String.valueOf(x);
      clients.add(new Client(id, "John Doe ".concat(id)));
    }
    return clients;
  }
}
