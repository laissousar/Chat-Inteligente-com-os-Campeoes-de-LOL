package me.dio.sdw2024.domain.exception;

public class ChampionNOtFoundException extends RuntimeException{

    public ChampionNOtFoundException(Long championId) {
        super("Champion %d not found".formatted(championId));
    }
}
