package com.example.reactor.application;


import com.example.reactor.domain.model.Client;
import com.example.reactor.domain.usecase.ClientUseCase;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;


import java.time.Duration;

public class MainApplication {


  public static void main(String[] args) {
    System.out.println("Main Application started..");
    ClientUseCase clientUseCase = new ClientUseCase();

    Flux<Client> flux = clientUseCase.getClients(99);
    Disposable disposable = flux
        .buffer(10)
        .delayElements(Duration.ofMillis(1000))
        .subscribe(client -> System.out.println(client.toString()));

    try {
      Thread.sleep(30000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
