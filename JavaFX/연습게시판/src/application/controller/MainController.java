package application.controller;

import java.util.List;

import application.DTO.Board;
import application.Service.BoardService;
import application.Service.BoardServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainController {

	@FXML private TableView<Board> tableView;
	@FXML private TableColumn<Board, Integer> colNo;
	@FXML private TableColumn<Board, String> colTitle;
	@FXML private TableColumn<Board, String> colWriter;
    @FXML private TableColumn<Board, String> colCreatedAt;
    @FXML private TableColumn<Board, String> colUpdatedAt;
    
    // 게시글 목록 데이터
    List<Board> boardList = null;
    BoardService boardService = new BoardServiceImpl();
    
	// 데이터 초기화

    @FXML
    void exit(ActionEvent event) {

    }

    @FXML
    void insert(ActionEvent event) {

    }

}
