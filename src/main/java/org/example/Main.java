package org.example;
import org.example.Computer.Computer;
import org.example.House.House;
import org.example.Safe.Safe;

public class Main {
    public static void main(String[] args) {
        House house = new House("123 Main St.");
        Safe safe = new Safe(1234);
        Computer computer = new Computer("password");


        Lockable lockable = () -> {
            house.lock();
            safe.lock();
            computer.lock();
        };

        lockable.lock();
            }
        }