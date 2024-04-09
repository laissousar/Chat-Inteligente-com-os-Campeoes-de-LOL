package me.dio.sdw2024.application;

import me.dio.sdw2024.domain.exception.ChampionNOtFoundException;
import me.dio.sdw2024.domain.model.Champions;
import me.dio.sdw2024.domain.ports.ChampionsRepository;

public record AskChampionUseCase(ChampionsRepository repository) {

    public String askChampion(Long championId, String question){
        Champions champion = repository.findById(championId)
                .orElseThrow(() -> new ChampionNOtFoundException(championId));

        return champion.generateContextByQuestion(question);
    }
}
