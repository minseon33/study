package hanteoGlobal.repository;

import hanteoGlobal.entity.Board;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


class MemoryBoardRepositoryTest {

    MemoryBoardRepository boardRepository = new MemoryBoardRepository();

    @AfterEach
    void AfterEach(){
        boardRepository.clearBoard();
    }

    @Test
    void save() {
        //given
        Board board = new Board("ExoNotice");
        Board board2 = new Board("Chen");
        //when
        Long save = boardRepository.save(board);
        Long save1 = boardRepository.save(board2);
        //then
        assertThat(save).isEqualTo(0L);
        assertThat(save1).isEqualTo(1L);
    }

    @Test
    void findById() {
        Board board = new Board("ExoNotice");
        Board board2 = new Board("Chen");
        Long save = boardRepository.save(board);
        Long save1 = boardRepository.save(board2);
        //when
        Optional<Board> testBoard = boardRepository.findById(save1);

        //then
        assertThat(testBoard.get().getId()).isEqualTo(1L);
    }

    @Test
    void findByName() {
        //given
        Board board = new Board("ExoNotice");
        Board board2 = new Board("Chen");
        Long save = boardRepository.save(board);
        Long save1 = boardRepository.save(board2);

        //when
        Optional<Board> testBoard = boardRepository.findByName("Chen");

        //then
        assertThat(testBoard.get().getId()).isEqualTo(1L);
    }

    @Test
    void findAll() {
        //given
        Board board = new Board("ExoNotice");
        Board board2 = new Board("Chen");
        Long save = boardRepository.save(board);
        Long save1 = boardRepository.save(board2);

        //when
        List<Board> all = boardRepository.findAll();

        //then
        assertThat(all.size()).isEqualTo(2);

        for (Board x : all) {
            System.out.println("ID : " + x.getId().toString() + ", Name : " + x.getName().toString());
        }
    }
}