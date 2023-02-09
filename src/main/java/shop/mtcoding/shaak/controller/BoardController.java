package shop.mtcoding.shaak.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import shop.mtcoding.shaak.dto.ResponsDto;
import shop.mtcoding.shaak.dto.board.BoardRe.BoardSaveReqDto;
import shop.mtcoding.shaak.handler.ex.CustomApiException;
import shop.mtcoding.shaak.handler.ex.CustomException;
import shop.mtcoding.shaak.model.BoardRepository;
import shop.mtcoding.shaak.model.User;
import shop.mtcoding.shaak.service.BoardService;

@Controller
public class BoardController {


    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private HttpSession session;

    @PostMapping("/board")
    public @ResponseBody ResponseEntity<?> save(@RequestBody BoardSaveReqDto BoardSaveReqDto){
        User principal = (User) session.getAttribute("principal");
        if (principal == null) {
            throw new CustomException("인증이 되지 않았습니다.", HttpStatus.UNAUTHORIZED);
        }
        if (BoardSaveReqDto.getTitle() == null || BoardSaveReqDto.getTitle().isEmpty() ) {
            throw new CustomException("title 을 작성해라");
        }
        if (BoardSaveReqDto.getContent() == null || BoardSaveReqDto.getContent().isEmpty()) {
            throw new CustomException("Content를 입력해라");
        }
        if (BoardSaveReqDto.getTitle().length() > 100) {
            throw new CustomApiException("title의 길이가 100자 이하여야 한다.");
        }

        boardService.글쓰기(BoardSaveReqDto, principal.getId());

        return new ResponseEntity<>(new ResponsDto<> (1, "게시글수정성공", null),HttpStatus.OK);
    }



    @GetMapping({"/","/board"})
    public String main(Model model){
        model.addAttribute("dtos", boardRepository.findAllWithUser());
    return "board/main";
    }

    @GetMapping("/board/saveForm")
    public String saveForm(){
        return "board/saveForm";
    }

    @GetMapping("/board/{id}/updateForm")
    public String updateForm(){
        return "board/updateForm";
    }

    
}
