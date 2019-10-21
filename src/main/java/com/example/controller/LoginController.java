package com.example.controller;

import com.example.pojo.*;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;
    private HttpServletRequest servletRequest;

    @RequestMapping(value = "/index")
    public String index(String shokucd, String stepflg) {
        return "login";
    }

    @RequestMapping(value = "/control/kgylist/getkgyinfo")
    @ResponseBody
    public ReturnInfo enterpriseShow(String iwebsiteid, String stgflg, String lastaccessdate, HttpServletResponse response) {
        ReturnInfo reInfo = new ReturnInfo();
        Menu_data Menu_data = new Menu_data();
        if (iwebsiteid.equals("B001")) {
            reInfo.setStatus("2");
            reInfo.setMessage("問題が発生しました。");
        } else if (iwebsiteid.equals("B002")) {
            reInfo.setStatus("97");
            reInfo.setMessage("サービス利用期間ではありません。");
        } else if (iwebsiteid.equals("B003")) {
            reInfo.setStatus("98");
            reInfo.setMessage("問題が発生しました。お問い合わせしてください。");
        } else if (iwebsiteid.equals("B004")) {
            reInfo.setStatus("96");
            reInfo.setMessage("サイトIDが正しくありません。ご確認の上、再度お取り組みください。");
        } else if (iwebsiteid.equals("B03")) {
            reInfo.setStatus("1");
            Menu_data.setStopflg("0");
            Menu_data.setKgynm("会社B01会社B01会社B01会社B01会社B01会社B01会社B01会社B01会社B01会社B01");
            Menu_data.setIwebsiteid(iwebsiteid);
            Menu_data.setNoticeCount("3");
            Menu_data.setUrl("http://192.168.1.98:5050");
            Menu_data.setIconurl("http://192.168.1.98:5050/image/ic_launcher1.png");
            Menu_data.setUploadurl("http://192.168.1.98:5050/videoUpload");
            Menu_data.setFrom("2019年10月10日 10:00から");
            Menu_data.setTo("2019年10月10日 10:00まで");
            Menu_data.setColorback("#902a2a");
            Menu_data.setAccessdate("2019/08/01 00:00:00");
            Map<String, String> menu = new HashMap();
            menu.put("1", "面接");
            menu.put("2", "QRチェックイン");
            Menu_data.setMenu(menu);
            // reInfo.setStatus("1");
            reInfo.setData(Menu_data);
        } else if (iwebsiteid.equals("B04")) {
            Menu_data.setStopflg("0");
            Menu_data.setKgynm("会社B04");
            Menu_data.setIwebsiteid(iwebsiteid);
            Menu_data.setNoticeCount("3");
            Menu_data.setUrl("http://192.168.1.98:5050");
            Menu_data.setIconurl("http://192.168.1.98:5050/image/sony.jpg");
            Menu_data.setUploadurl("http://192.168.1.98:5050/videoUpload");
            Menu_data.setFrom("2019年10月10日 10:00から");
            Menu_data.setTo("2019年10月10日 10:00まで");
            Map<String, String> menu = new HashMap();
            Menu_data.setColorback("#126FF8");
            reInfo.setStatus("1");
            Menu_data.setAccessdate("2019/08/01 00:00:00");
            menu.put("1", "面接");
            menu.put("2", "QRチェックイン");
            Cookie cookie = new Cookie("username", "admin");
            response.addCookie(cookie);
            Menu_data.setMenu(menu);
            reInfo.setData(Menu_data);
        } else if (iwebsiteid.equals("B05")) {
            Menu_data.setStopflg("0");
            Menu_data.setKgynm("会社B05");
            Menu_data.setIwebsiteid(iwebsiteid);
            Menu_data.setNoticeCount("3");
            Menu_data.setUrl("http://192.168.1.98:5050");
            Menu_data.setIconurl("http://192.168.1.98:5050/image/bb.gif");
            Menu_data.setUploadurl("http://192.168.1.98:5050/videoUpload");
            Menu_data.setFrom("2019年10月10日 10:00から");
            Menu_data.setTo("2019年10月10日 10:00まで");
            Menu_data.setAccessdate("2019/08/01 00:00:00");
            Map<String, String> menu = new HashMap();
            Menu_data.setColorback("#d4237a");
            menu.put("1", "面接");
            menu.put("2", "QRチェックイン");
            Menu_data.setMenu(menu);
            reInfo.setStatus("1");
            reInfo.setData(Menu_data);
        } else if (iwebsiteid.equals("B06")) {
            Menu_data.setStopflg("0");
            Menu_data.setKgynm("会社B06");
            Menu_data.setIwebsiteid(iwebsiteid);
            Menu_data.setNoticeCount("3");
            Menu_data.setUrl("http://192.168.1.98:5050");
            Menu_data.setIconurl("http://192.168.1.98:5050/image/aa.jpg");
            Menu_data.setUploadurl("http://192.168.1.98:5050/videoUpload");
            Menu_data.setAccessdate("2019/08/01 00:00:00");
            Menu_data.setFrom("2019年10月10日 10:00から");
            Menu_data.setTo("2019年10月10日 10:00まで");
            Menu_data.setColorback("#32ca69");
            Map<String, String> menu = new HashMap();
            menu.put("1", "面接");
            menu.put("2", "QRチェックイン");
            Menu_data.setMenu(menu);
            reInfo.setStatus("1");
            reInfo.setData(Menu_data);
        } else if (iwebsiteid.equals("B07")) {
            Menu_data.setStopflg("0");
            Menu_data.setKgynm("会社B07");
            Menu_data.setIwebsiteid(iwebsiteid);
            Menu_data.setNoticeCount("3");
            Menu_data.setUrl("http://192.168.1.98:5050");
            Menu_data.setIconurl("http://192.168.1.98:5050/image/xiaomi.jpg");
            Menu_data.setUploadurl("http://192.168.1.98:5050/videoUpload");
            Menu_data.setAccessdate("2019/08/02 00:00:00");
            Menu_data.setFrom("2019年10月10日 10:00から");
            Menu_data.setTo("2019年10月10日 10:00まで");
            Menu_data.setColorback("#82529d");
            Map<String, String> menu = new HashMap();
            menu.put("1", "面接");
            menu.put("2", "QRチェックイン");
            Menu_data.setMenu(menu);
            reInfo.setStatus("1");

            reInfo.setData(Menu_data);
        }
        return reInfo;
    }

    @RequestMapping(value = "/applicant/login/check", method = RequestMethod.GET)
    @ResponseBody
    public ReturnInfo login(String gksid, String gkspw, HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        System.out.println(cookies);
        ReturnInfo reInfo = new ReturnInfo();
        User user = new User();
        if ("admin".equals(gksid) && "admin".equals(gkspw)) {
            reInfo.setStatus("1");
            Cookie cookie = new Cookie("username", "admin123");
            response.addCookie(cookie);
            user.setFirstloginflg("0");
        } else if ("admin".equals(gksid) && "123456".equals(gkspw)) {
            reInfo.setStatus("97");
            reInfo.setMessage("「ID」「PASSWORD」のいずれかが正しくありません。もう一度入力してください");
        } else if ("admin".equals(gksid) && "123".equals(gkspw)) {
            reInfo.setStatus("98");
        } else if ("user".equals(gksid) && "123".equals(gkspw)){
            reInfo.setStatus("3");
            reInfo.setMessage("初回ログインを先に済ませてください。");
        }
        reInfo.setUser(user);
        return reInfo;
    }

    @RequestMapping(value = "/applicant/top/get-app-event-list")
    @ResponseBody
    public ReturnInfo interviewListShow(@RequestHeader(value = "enterpriseId") String enterpriseId, HttpServletRequest request) {

        ReturnInfo reInfo = new ReturnInfo();

        Cookie[] cookies = request.getCookies();
        if (cookies.length > 0) {
            List<Interview> interviewListTemp = new ArrayList<>();
            Interview interview;

            if (null != enterpriseId && !"".equals(enterpriseId)) {

                if ("B04".equals(enterpriseId)) {
                    reInfo.setStatus("97");
                }
                interview = new Interview();
                interview.setEventnm("「「一次面接「一次面接（オンライン）」「「一次面接（オンライン）」「「一次面接（オンライン）」「「一次面接（オンライン）」「（オンライン）」「「一次面接（オンライン）」「「一次面接（オンライン）」「一次面接（オンライン）」「一次面接（オンライン）」「一次面接（オンライン）」「一次面接（オンライン）」「一次面接（オンライン）」「一次面接（オンライン）」「一次面接（オンライン）」「一次面接（オンライン）」「一次面接（オンライン）」");
                interview.setFrom("2019年10月10日 10:00から");
                interview.setTo("2019年10月10日 10:00まで");
                interview.setEventurl("http://vps.cyberfrontier.jp/worksystem/yyy.html");
                interview.setShokucd("1");
                interview.setStepflg("1");
                interview.setEventmessage("イベントステータス文言");
                interviewListTemp.add(interview);

                if ("B05".equals(enterpriseId)) {

                    interview = new Interview();

                    interview.setEventnm("「二次面接（オンライン）」");
                    interview.setFrom("2019年10月10日 10:00から");
                    interview.setTo("2019年10月10日 10:00まで");
                    interview.setEventurl("http://vps.cyberfrontier.jp/worksystem/yyy.html");
                    interview.setShokucd("2");
                    interview.setStepflg("2");
                    reInfo.setStatus("1");
                    interview.setEventmessage("イベントステータス文言");
                    interviewListTemp.add(interview);
                }

                interview = new Interview();
                interview.setEventnm("「三次面接（オンライン）」");
                interview.setFrom("2019年10月10日 10:00から");
                interview.setTo("2019年10月10日 10:00まで");
                interview.setEventurl("http://vps.cyberfrontier.jp/worksystem/yyy.html");
                interview.setShokucd("1");
                interview.setStepflg("1");
                interview.setEventmessage("イベントステータス文言");
                interviewListTemp.add(interview);

                interview = new Interview();
                interview.setEventnm("「四次面接（オンライン）」");
                interview.setFrom("2019年10月10日 10:00から");
                interview.setTo("2019年10月10日 10:00まで");
                interview.setEventurl("http://vps.cyberfrontier.jp/worksystem/yyy.html");
                interview.setShokucd("1");
                interview.setStepflg("1");
                interview.setEventmessage("イベントステータス文言");
                interviewListTemp.add(interview);
            } else {
                interview = new Interview();
                interview.setEventnm("「yhy_test（オンライン）」");
                interview.setFrom("2019年10月10日 10:00から");
                interview.setTo("2019年10月10日 10:00まで");
                interview.setEventurl("http://vps.cyberfrontier.jp/worksystem/yyy.html");
                interview.setShokucd("1");
                interview.setStepflg("1");
                interview.setEventmessage("イベントステータス文言");
                interviewListTemp.add(interview);
                reInfo.setStatus("1");
            }
            Map<String, List<Interview>> data2 = new HashMap();
            data2.put("1", interviewListTemp);
            //reInfo.setInterviewList(interviewListTemp);
            reInfo.setData2(data2);
            reInfo.setStatus("1");
            return reInfo;
            // reInfo.setInterviewList(interviewListTemp);
        }else {
            reInfo.setStatus("1001");
            reInfo.setMessage("Cookie missing·····");
            return reInfo;
        }
    }

    @RequestMapping(value = "/interviewListShow_yhy")
    @ResponseBody
    public ReturnInfo yhy_interviewListShow() {

        ReturnInfo reInfo = new ReturnInfo();
        List<Interview> interviewListTemp = new ArrayList<>();
        Interview interview = new Interview();
        interview.setEventnm("「yhy_test1（オソライソ）」");
        interview.setFrom("2019年10月10日 10:00から");
        interview.setTo("2019年10月10日 10:00まで");
        interview.setEventurl("http://vps.cyberfrontier.jp/worksystem/yyy.html");
        interview.setShokucd("1");
        interview.setStepflg("1");
        interview.setEventmessage("イベントステータス文言");
        interviewListTemp.add(interview);

        Interview interview2 = new Interview();
        interview2.setEventnm("「yhy_test2（オソライソ）」");
        interview2.setFrom("2019年10月10日 10:00から");
        interview2.setTo("2019年10月10日 10:00まで");
        interview2.setEventurl("http://vps.cyberfrontier.jp/worksystem/yyy.html");
        interview2.setShokucd("1");
        interview2.setStepflg("1");
        interview.setEventmessage("イベントステータス文言");
        interviewListTemp.add(interview2);

        Interview interview3 = new Interview();
        interview3.setEventnm("「yhy_test3（オソライソ）」");
        interview3.setFrom("2019年10月10日 10:00から");
        interview3.setTo("2019年10月10日 10:00まで");
        interview3.setEventurl("http://vps.cyberfrontier.jp/worksystem/yyy.html?shokucd=x&stepflag=y");
        interview3.setShokucd("1");
        interview3.setStepflg("1");
        interview.setEventmessage("イベントステータス文言");
        interviewListTemp.add(interview3);

        Map<String, List<Interview>> data2 = new HashMap();
        data2.put("1", interviewListTemp);
        //reInfo.setInterviewList(interviewListTemp);
        reInfo.setData2(data2);
        return reInfo;
    }

    @RequestMapping(value = "/detail_yhy")
    @ResponseBody
    public ReturnInfo yhy_interviewListShow2() {
        List<yhy_info> yhy_infoList2 = new ArrayList<>();
        yhy_info yhy_infogg = new yhy_info();
        yhy_infogg.setTitle("卡片推荐「1」");
        yhy_infogg.setDetail("银联卡「1」");
        yhy_infogg.setImg("http://192.168.1.98:5050/image/aab.jpg");
        yhy_infoList2.add(yhy_infogg);
        yhy_info yhy_infogg2 = new yhy_info();
        yhy_infogg2.setTitle("卡片推荐「2」");
        yhy_infogg2.setDetail("银联卡「2」");
        yhy_infogg2.setImg("http://192.168.1.98:5050/image/sony3.jpg");
        yhy_infoList2.add(yhy_infogg2);

        ReturnInfo reInfo = new ReturnInfo();
        List<yhy_info> yhy_infoList = new ArrayList<>();
        yhy_info yhy_info1 = new yhy_info();
        yhy_info1.setTitle("卡片推荐1");
        yhy_info1.setDetail("银联卡1");
        yhy_info1.setImg("http://192.168.1.98:5050/image/aa.jpg");
        yhy_info1.setInfos(yhy_infoList2);
        yhy_infoList.add(yhy_info1);
        yhy_info yhy_info2 = new yhy_info();
        yhy_info2.setTitle("卡片推荐2");
        yhy_info2.setDetail("银联卡2");
        yhy_info2.setImg("http://192.168.1.98:5050/image/sony.jpg");
        yhy_info2.setInfos(yhy_infoList2);
        yhy_infoList.add(yhy_info2);
        yhy_info yhy_info3 = new yhy_info();
        yhy_info3.setTitle("卡片推荐3");
        yhy_info3.setDetail("银联卡3");
        yhy_info3.setImg("http://192.168.1.98:5050/image/xiaomi.jpg");
        yhy_info3.setInfos(yhy_infoList2);
        yhy_infoList.add(yhy_info3);
        reInfo.setYhy_infos(yhy_infoList);
        return reInfo;
    }

    @RequestMapping(value = "/interviewListShow_lcz")
    @ResponseBody
    public ReturnInfo lcz_interviewListShow(String gksid, String kgyid, HttpServletResponse response) {
        ReturnInfo reInfo = new ReturnInfo();
        Info info = new Info();
        info.setInfoId("7001");
        info.setLoginId(gksid);
        info.setCompanyId(kgyid);
        info.setFaceTime("2019-09-10 15:20:15");
        reInfo.setInfo(info);
        reInfo.setStatus("2");
        Cookie cookie = new Cookie("name", "lcz");
        Cookie cookie2 = new Cookie("sex", "lcz");
        response.addCookie(cookie);
        response.addCookie(cookie2);
        return reInfo;
    }

    @RequestMapping(value = "/movie/video")
    @ResponseBody
    public ReturnInfo videoUpload(@RequestParam(value = "v_time") String v_time, @RequestParam(value = "v_gkscd") String v_gkscd
            , @RequestParam(value = "v_shokucd") String v_shokucd, @RequestParam(value = "v_itemno") String v_itemno, @RequestParam(value = "v_limitsize") String v_limitsize
            , @RequestParam(value = "v_inputext") String v_inputext, @RequestParam(value = "v_check") String v_check, @RequestParam(value = "v_previewFlg") String v_previewFlg
            , @RequestParam(value = "v_params") String v_params, @RequestParam(value = "pra") String pra, @RequestParam(value = "ap_count") String ap_count
            , @RequestParam(value = "ap_time") String ap_time, @RequestParam(value = "ap_title") String ap_title, @RequestParam(value = "ap_clear") String ap_clear
            , @RequestParam(value = "movie") MultipartFile multipartFile) {
        ReturnInfo returnInfo = new ReturnInfo();
        String fileName = multipartFile.getOriginalFilename();
        //String fileSuffix = fileName.substring(fileName.lastIndexOf("."), fileName.length());
        String localFileName = System.currentTimeMillis() + ".mp4";
        String filePath = "E:/" + File.separator + localFileName;
        File localFile = new File(filePath);
        File imagePath = new File("E:/");
        if (!imagePath.exists()) {
            imagePath.mkdirs();
        }
        try {
            multipartFile.transferTo(localFile);
            returnInfo.setStatus("1");
        } catch (IOException e) {
            returnInfo.setStatus("2");
            e.printStackTrace();
        }
        return returnInfo;
    }

    @RequestMapping(value = "/noticeShow")
    @ResponseBody
    public ReturnInfo noticeShow(@RequestHeader(value = "tokenId") String
                                         tokenId, @RequestHeader(value = "loginId") String loginId, @RequestHeader(value = "enterpriseId") String
                                         enterpriseId) {
        ReturnInfo reInfo = new ReturnInfo();
        reInfo.setStatus("1");
        List<Notice> noticeList = new ArrayList<>();
        Notice notice = new Notice();

        if (!"B01".equals(enterpriseId)) {
            reInfo.setStatus("2");
        } else {
            notice.setUrl("http://vps.cyberfrontier.jp/worksystem/yyy.html");
            notice.setBody("123457890");
            notice.setTitle("お知らせテスト１");
            notice.setCreateDate("2019-09-10 15:20:15");
            noticeList.add(notice);

            notice = new Notice();

            notice.setUrl("http://vps.cyberfrontier.jp/worksystem/yyy.html");
            notice.setBody("お知らせテスト2");
            notice.setTitle("お知らせテスト2");
            notice.setCreateDate("2019-09-11 15:20:15");
            noticeList.add(notice);

            notice = new Notice();

            notice.setUrl("http://vps.cyberfrontier.jp/worksystem/yyy.html");
            notice.setBody("");
            notice.setTitle("お知らせテスト3");
            notice.setCreateDate("2019-06-12 15:20:15");
            noticeList.add(notice);

        }
        reInfo.setNoticeList(noticeList);
        return reInfo;

    }

    @RequestMapping(value = "/applicant/attend/regist")
    @ResponseBody
    public ReturnInfo QRCodeUpdate(@RequestHeader(value = "tokenId") String tokenId,
                                   @RequestHeader(value = "loginId") String loginId,
                                   @RequestHeader(value = "enterpriseId") String enterpriseId,
                                   @RequestParam(value = "params") String QRCode,
                                   @RequestParam(value = "senddate") String senddate) {
        ReturnInfo reInfo = new ReturnInfo();
        reInfo.setStatus("1");

        if (loginId.equals("B01") && null != QRCode && !"".equals(QRCode)) {
            reInfo.setStatus("1");
            reInfo.setMessage("出席を確認しました。");
        }

        if (loginId.equals("B06") && null != QRCode && !"".equals(QRCode)) {
            reInfo.setStatus("2");
        }

        if (loginId.equals("B04") && null != QRCode && !"".equals(QRCode)) {
            reInfo.setStatus("3");
            reInfo.setMessage("受付時間外です。");
        }

        if (loginId.equals("B05") && null != QRCode && !"".equals(QRCode)) {
            reInfo.setStatus("99");
        }

        return reInfo;

    }

    @RequestMapping(value = "/applicant/security/logout")
    @ResponseBody
    public ReturnInfo logout() {
        ReturnInfo reInfo = new ReturnInfo();
        reInfo.setStatus("1");
        return reInfo;
    }

    @RequestMapping(value = "app_versionup/Android.json")
    @ResponseBody
    public VersionInfo app_versionUp(HttpServletResponse response) {
        VersionInfo versionInfo = new VersionInfo();
        versionInfo.setCurrent_version("1.0.1");
        versionInfo.setForce_version_up("1");
        versionInfo.setMaintenance("0");
        versionInfo.setMessage("新しいバージョンがあります");
        versionInfo.setUrl("https://play.google.com/store/apps/details?id=jp.co.humanage.newgrad2018app&hl=ja");
        Cookie cookie = new Cookie("name", "lcz");
        List<customize_maintenance> customizeMaintenanceList = new ArrayList<>();
        customize_maintenance customize_maintenance = new customize_maintenance();
        customize_maintenance.setIwebsiteid("B04");
        customize_maintenance.setMessage("企業B04システムメンテナンス中です");
        customize_maintenance customize_maintenance2 = new customize_maintenance();
        customize_maintenance2.setIwebsiteid("B05");
        customize_maintenance2.setMessage("企業B05システムメンテナンス中です");
        customizeMaintenanceList.add(customize_maintenance);
        customizeMaintenanceList.add(customize_maintenance2);
        versionInfo.setCustomize_maintenance(customizeMaintenanceList);
        response.addCookie(cookie);
        return versionInfo;
    }

    @RequestMapping(value = "/next")
    public ModelAndView loginSuccess(@RequestParam("username") String username) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("enterpriseDetail");
        modelAndView.addObject("username", username);
        return modelAndView;
    }

    @RequestMapping(value = "/findEnterprise")
    @ResponseBody
    public List<Enterprise> findEnterprise(String enterpriseId) {
        System.out.println(enterpriseId + "---------------------");
        List<Enterprise> list = loginService.findEnterprise(enterpriseId);
        return list;
    }
//    public ModelAndView login(String username, String pwd) {
//        ModelAndView modelAndView = new ModelAndView();
//        String name = username;
//        String passwrod = pwd;
//        User user = loginService.login(username,pwd);
//        if (user != null){
//            modelAndView.setViewName("enterpriseDetail");
//            modelAndView.addObject("username", user.getRealname());
//            return modelAndView;
//        }
//
//    }
}
