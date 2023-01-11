package ch07.ex04.case05.Dao;

import ch07.ex04.case05.domain.Score;

public interface ScoreDao {
	void insertScore(Score score);
	Score[] selectScores();
}
