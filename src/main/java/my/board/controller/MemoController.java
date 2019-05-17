package my.board.controller;

import java.util.List;

import my.board.model.MemoVO;
import my.board.service.MemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

//@SessionAttributes("memoVO")
@Controller
public class MemoController {

		//memo_write에서 ~해서 view로 보내주기위해
		
		@Autowired
		MemoService mService;
		
//		@ModelAttribute("memoVO")
//		public MemoVO newMemo() {
//			return new MemoVO();
//		}
		
//		@RequestMapping(value="memo", method=RequestMethod.GET)
//		public String memo(@ModelAttribute("memoVO") MemoVO memoVO,Model model) {
//			model.addAttribute("memoVO",memoVO);
//			model.addAttribute("BODY","MEMO_WRITE");
//			return "home";
//		}
//		
//		
//		@RequestMapping(value="memo",method=RequestMethod.POST)
//		public String memo(@ModelAttribute("memoVO") MemoVO memoVO,
//							SessionStatus session, Model model) {
//			// db insert
//			mService.insert(memoVO);
//			// memoVO session초기화
//			session.setComplete();
//			return "redirect:/";
//		}
		
		@RequestMapping(value="/", method=RequestMethod.GET)
		public String list(Model model) {
			
			List<MemoVO> memos = mService.selectAll();
			model.addAttribute("MEMOS",memos);
			model.addAttribute("BODY","MEMO_LIST");
			return "home";
		}

//		@RequestMapping(value="delete", method=RequestMethod.GET)
//		public String delete(@RequestParam("id") long id, Model model) {
//			mService.delete(id);
//			return "redirect:list";
//		}
	
}
