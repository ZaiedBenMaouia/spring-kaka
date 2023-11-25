Ouvrir le terminal est ecxcuter docker-compsoe up  pour rouler les deux images docker (zookeper et kafka).

Executer les deux commande line :
      - docker exec kafka-kafka-1 kafka-topics --bootstrap-server localhost:9092 --create --topic "customer-event"
      - docker exec --interactive --tty kafka-kafka-1 kafka-console-consumer --bootstrap-server localhost:9092 --topic "event-customer" --from-begin
        ning

Lancer L'application spring-boot : un message kafka va etre envoyer automatiquement
