package com.crick.apis.services;

import com.crick.apis.entities.Match;

import java.util.List;

public interface MatchService {
    // get all matches
    List<Match> getAllMatches();
    // get live matches
    List<Match> getLiveMatches();
    // get cw2023 point table
    List<List<String>> getPointTable();
}
