package ch07.ex04.case05.test;

import ch07.ex04.case05.Dao.ScoreDao;
import ch07.ex04.case05.Dao.ScoreDaoImpl;
import ch07.ex04.case05.domain.Score;

public class ScoreDaoTest {
		public static void main(String[] args) {
//			fixture
			Score[] scores = new Score[2];
			ScoreDao scoreDao = new ScoreDaoImpl(scores);

			scoreDao.insertScore(new Score(20, 50, 89));
			scoreDao.insertScore(new Score(89, 49, 76));

			scores = scoreDao.selectScores();
			for(Score score: scores) System.out.println(score);
	}
}