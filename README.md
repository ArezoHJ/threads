# Java-trådar

Ett enkelt Java-program som visar hur flera trådar kan arbeta samtidigt. Programmet passar dig som vill lära dig grunderna i `Thread`, `start()`, `run()` och `join()`.

## Vad gör programmet?

När du startar programmet vanligt börjar tre trådar arbeta:

- **NumberThread** skriver ut siffrorna 1–10 med en sekunds mellanrum.
- **MessageThread** skriver ut `Jag arbetar!` fem gånger med två sekunders mellanrum.
- **CountdownThread** räknar ned från 10 till 1 med en sekunds mellanrum.

Eftersom trådarna arbetar samtidigt kan deras utskrifter blandas. Ordningen kan vara olika från en körning till en annan.

När alla tre trådarna är färdiga skriver programmet:

```text
Alla trådar är klara!
```

## Så fungerar `start()`, `run()` och `join()`

- `start()` startar arbetet i en egen tråd. Då kan flera trådar arbeta samtidigt.
- `run()` innehåller arbetet som tråden ska göra. Om du själv anropar `run()` direkt startas ingen ny tråd; arbetet körs som ett vanligt metodanrop.
- `join()` gör att huvudprogrammet väntar tills en tråd är färdig. Programmet väntar på alla tre innan det skriver att trådarna är klara.

## Kör programmet

Du behöver Java och `javac` installerat. Öppna en terminal i projektets mapp och kör:

```bash
mkdir -p out
javac -d out src/*.java
java -cp out Main
```

Den första raden skapar en mapp för de kompilerade filerna. Den andra kompilerar Java-koden. Den tredje startar programmet.

## Testa `run()` i stället för `start()`

Kör detta kommando:

```bash
java -cp out Main run
```

Då körs `NumberThread` genom ett direkt anrop till `run()`. Siffrorna skrivs ut i tur och ordning, och de två andra trådarna startas inte. Det visar att `run()` i sig inte skapar en ny tråd.

## Projektets filer

```text
src/
├── Main.java
├── NumberThread.java
├── MessageThread.java
└── CountdownThread.java
```

`Main.java` startar och väntar på trådarna. De andra filerna innehåller varsin tråd.
