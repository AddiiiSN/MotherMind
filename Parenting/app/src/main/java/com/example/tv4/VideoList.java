package com.example.tv4;

import java.util.ArrayList;
import java.util.List;



public final class VideoList {
    public static final String VIDEO_CATEGORY[] = {
            "USIA KANDUNGAN",
            "BATITA",
            "BALITA",
            "ANAK - ANAK"
    };

    private static List<Video> list;
    private static long count = 0;

    public static List<Video> getList() {
        if (list == null) {
            list = new ArrayList<>();
            list.addAll(setupVideos1());
            list.addAll(setupVideos2());
            list.addAll(setupVideos3());
            list.addAll(setupVideos4());
        }
        return list;
    }

    private static Video buildVideoInfo(String title, String description, String videoUrl, String cardImageUrl, String backgroundImageUrl) {
        Video video = new Video();
        video.setId(count++);
        video.setTitle(title);
        video.setDescription(description);
        video.setCardImageUrl(cardImageUrl);
        video.setBackgroundImageUrl(backgroundImageUrl);
        video.setVideoUrl(videoUrl);
        return video;
    }

    public static List<Video> setupVideos1() {
        return setupVideos(
                new String[] {
                        "TRIMESTER PERTAMA",
                        "TRIMESTER KEDUA",
                        "TRIMESTER KETIGA",
                        "POSTPARTUM",
                },
                new String[] {
                        "Trimester pertama dimulai dari konsepsi hingga 12 minggu pertama kehamilan. Pada periode ini, organ-organ utama janin mulai terbentuk, dan perubahan fisik awal terjadi pada ibu hamil.",
                        "Trimester kedua berlangsung dari minggu ke-13 hingga minggu ke-27 kehamilan. Pada trimester ini, janin berkembang lebih lanjut dan mulai terasa gerakan-gerakan janin oleh ibu hamil. Ibu hamil juga dapat mengalami perubahan fisik seperti pertambahan berat badan dan pertumbuhan perut yang lebih nyata.",
                        "Trimester ketiga dimulai dari minggu ke-28 hingga persalinan. Pada trimester ini, janin terus tumbuh dan berkembang, organ-organ janin semakin matang, dan persiapan tubuh untuk persalinan dilakukan. Ibu hamil mungkin akan mengalami ketidaknyamanan fisik yang lebih besar dan mulai merasakan kontraksi persalinan.",
                        "Setelah persalinan, periode postpartum dimulai. Ini adalah waktu pemulihan bagi ibu setelah melahirkan. Proses penyembuhan fisik dan penyesuaian hormonal terjadi pada ibu. Pada periode ini, perhatian juga ditujukan pada perawatan dan pertumbuhan bayi.",

                },
                new String[] {
                        "https://res.cloudinary.com/dlmjnzi46/video/upload/v1688180340/y2mate.com_-_PERKEMBANGAN_JANIN_TRIMESTER_PERTAMA_USIA_112_MINGGU_1080p_mgkrf3.mp4",
                        "https://res.cloudinary.com/dlmjnzi46/video/upload/v1688180497/y2mate.com_-_PERKEMBANGAN_JANIN_TRIMESTER_2_MINGGU_1327_1080p_zhtfjb.mp4",
                        "https://res.cloudinary.com/dlmjnzi46/video/upload/v1688180605/y2mate.com_-_PERKEMBANGAN_JANIN_TRIMESTER_3_MINGGU_2840_1080p_vadc5i.mp4",
                        "https://res.cloudinary.com/dlmjnzi46/video/upload/v1688180768/Baby_Blues_dan_Gangguan_Psikologis_Postpartum_Lain_jgkrks.mp4",
                },
                new String[] {
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688181098/perkembangan-janin-dan-ibu-hamil-minggu-ke-12-1677427897889060071_f18lqk.webp",
                        "https://res.cloudinary.com/dvdvdhoqt/image/upload/v1687708441/Proses_Perkembangan_Janin_pada_Kehamilan_Minggu_Ke-7_feedback_Anggi_-_image_2_rbp1v9.jpg",
                        "https://res.cloudinary.com/dvdvdhoqt/image/upload/v1687708682/perkembangan-janin-minggu-ke-40_w0qqyi.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688648938/Moms-Share-How-They-Overcame-Postpartum-Depression-722x406_eluq4b.jpg",
                },
                new String[] {
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650367/1_oooxoq.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650367/2_lqjwrb.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650367/3_jw22xm.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650367/4_hvivof.jpg",

                }
        );
    }

    public static List<Video> setupVideos2() {
        return setupVideos(
                new String[] {
                        "BAYI BARU LAHIR",
                        "BAYI USIA DINI",
                        "BATITA AWAL",
                        "BATITA AKHIR",
                },
                new String[] {
                        "Kategori ini mencakup bayi yang baru lahir hingga usia tiga bulan pertama. Pada periode ini, bayi mengalami perkembangan fisik yang pesat, seperti peningkatan berat badan, perkembangan organ-organ tubuh, dan peningkatan kemampuan motorik sederhana seperti menggerakkan tangan dan kaki. ",
                        "Kategori ini mencakup bayi yang berusia antara empat hingga dua belas bulan. Pada periode ini, bayi mulai mengembangkan kemampuan kognitif dan motorik yang lebih kompleks. Mereka belajar merangkak, duduk, berdiri, dan bahkan mungkin mulai berjalan. ",
                        "Kategori ini mencakup anak-anak yang berusia antara satu hingga dua tahun. Pada periode ini, anak-anak mulai menunjukkan peningkatan dalam kemampuan bahasa dan komunikasi. Mereka juga mulai mengeksplorasi lingkungan sekitar mereka secara aktif, menggunakan keterampilan motorik mereka untuk menjelajah dan berinteraksi dengan benda-benda di sekitar mereka.",
                        "Anak-anak pada usia ini mulai mengembangkan keterampilan berbicara yang lebih maju dan kemampuan kognitif seperti menghitung, mengenali bentuk dan warna, serta memecahkan masalah sederhana.  Mereka belajar berinteraksi dengan teman sebaya, mengungkapkan emosi dengan lebih baik, dan mengembangkan pemahaman tentang aturan dan norma sosial.",
               },
                new String[] {
                        "https://res.cloudinary.com/dlmjnzi46/video/upload/v1688819626/Stimulasi_Motorik_Bayi_0-3_Bulan_dan_Mainan_Untuk_Bayi_3_Bulan___Parent_University_pwnz7i.mp4",
                        "https://res.cloudinary.com/dlmjnzi46/video/upload/v1688820401/Tahap_Perkembangan_Motorik_Bayi_Usia_0-12_Bulan_yang_Normal_xzqi3l.mp4",
                        "https://res.cloudinary.com/dlmjnzi46/video/upload/v1688820773/Tahap_Perkembangan_Anak_1_Tahun_d0ijle.mp4",
                        "https://res.cloudinary.com/dlmjnzi46/video/upload/v1688820758/Tahap_Perkembangan_Anak_Usia_3_Tahun_yvbtrc.mp4",
                },
                new String[] {
                        "https://res.cloudinary.com/dvdvdhoqt/image/upload/v1687709648/unnamed_vsgybj.jpg",
                        "https://res.cloudinary.com/dvdvdhoqt/image/upload/v1687709734/perkembangan-bayi-10-bulan_x2bjrp.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688649347/1663717278-Tumbuh_Kembang_Bayi_12_Bulan_fgftkn.webp",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688649430/download_htlkiq.jpg",
                },
                new String[] {
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650367/5_u0ex98.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650367/6_tg9mqc.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688818896/MotherMind_uzipum.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650368/8_xuu3cy.jpg",
                }
        );
    }

    public static List<Video> setupVideos3() {
        return setupVideos(
                new String[] {
                        "ANAK USIA 1 TAHUN",
                        "ANAK USIA 2 TAHUN",
                        "ANAK USIA 3 TAHUN",
                        "ANAK USIA 4 TAHUN",
                },
                new String[] {
                        "Pada usia 1 tahun, anak mulai belajar berjalan dan mengenal objek-objek di sekitarnya. Mereka juga mulai mengucapkan kata-kata sederhana dan menunjukkan respons sosial seperti senyum dan mengacungkan tangan.",
                        "Anak mulai mengembangkan keterampilan motorik yang lebih baik, termasuk kemampuan berjalan dan berlari dengan lebih stabil. Bahasa anak juga semakin berkembang dengan menggunakan kalimat-kalimat pendek. Mereka menunjukkan keingintahuan yang tinggi terhadap lingkungan sekitar dan mulai berinteraksi dengan teman sebaya.",
                        "Anak semakin memperluas kosa kata dan mengenal angka, huruf, serta warna. Mereka mulai mengembangkan keterampilan bermain dan berimajinasi, serta memahami aturan dan instruksi sederhana. Anak pada usia ini juga mulai menunjukkan pemahaman awal tentang emosi dan interaksi sosial yang lebih kompleks.",
                        "Anak memiliki kemampuan berkomunikasi yang lebih baik dan mampu menggunakan kalimat yang jelas. Mereka mulai mengembangkan keterampilan motorik halus seperti menggambar dan menulis. Anak pada usia ini juga mampu mengikuti instruksi yang lebih kompleks dan memahami emosi serta interaksi sosial yang lebih kompleks.",
                           },
                new String[] {
                        "https://res.cloudinary.com/dscgwufgl/video/upload/f_auto:video,q_auto/ttplrmdgrzwznxjwqqvn",
                        "https://res.cloudinary.com/dscgwufgl/video/upload/f_auto:video,q_auto/z7migs2nsfsofwhvckbx",
                        "https://res.cloudinary.com/dscgwufgl/video/upload/f_auto:video,q_auto/xe7bonswzmayuymexqdx",
                        "https://res.cloudinary.com/dscgwufgl/video/upload/f_auto:video,q_auto/shbguoksirrlmkqh9kbq",
                },
                new String[] {
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688649551/anak-1-2tahun_xdtjgj.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688649600/adorable-boy-child-1104014-2cdf99ee89dc34229bb0f640d180a1f3_600xauto_fqjn0c.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688649615/perkembangan-anak-3-tahun-5_bug2g7.webp",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688649666/perkembangan-anak-5-tahun-_1_fej1dy.webp",
                },
                new String[] {
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650370/9_a42j0u.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650371/10_skjaj0.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650370/11_whldcl.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650371/12_a5cmbt.jpg",
                }
        );
    }

    public static List<Video> setupVideos4() {
        return setupVideos(
                new String[] {
                        "ANAK USIA 6 TAHUN",
                        "ANAK USIA 7 TAHUN",
                        "ANAK USIA 8 TAHUN",
                        "STRICT PARENTING",
                },
                new String[] {
                        "Pada usia ini, anak mulai menunjukkan kemajuan signifikan dalam berbagai aspek perkembangan mereka. Secara fisik, anak usia 6 tahun biasanya memiliki koordinasi motorik yang lebih baik, memungkinkan mereka untuk bergerak dengan lebih lincah dan terampil.",
                        "Dalam hal kognitif, anak usia 7 tahun mulai mengembangkan kemampuan berpikir logis yang lebih kompleks dan mampu memahami hubungan sebab-akibat yang lebih rumit. Mereka mampu menyelesaikan masalah dengan pendekatan yang lebih sistematis dan logis.",
                        "Dalam hal sosial dan emosional, anak usia 8 tahun semakin terampil dalam berinteraksi dengan teman sebaya dan mampu membangun hubungan yang lebih dalam. Mereka mulai mengembangkan rasa empati yang lebih kuat dan memahami perspektif orang lain. ",
                        "Strict parenting, atau pendekatan pengasuhan yang ketat, mengacu pada gaya pengasuhan yang menekankan aturan yang tegas, disiplin yang ketat, dan kontrol yang tinggi terhadap anak. Dalam praktiknya, orang tua yang menerapkan pendekatan ini cenderung memiliki harapan yang tinggi terhadap perilaku dan prestasi anak, serta menerapkan konsekuensi yang jelas dan ketat dalam menegakkan aturan.",
                         },
                new String[] {
                        "https://res.cloudinary.com/dieh1bqjp/video/upload/v1688108551/PERKEMBANGAN_SOSIAL_ANAK_USIA_6_TAHUN_mugxvi.mp4",
                        "https://res.cloudinary.com/dieh1bqjp/video/upload/v1688108687/PERKEMBANGAN_SOSIAL_ANAK_USIA_7_TAHUN_cdthbg.mp4",
                        "https://res.cloudinary.com/dieh1bqjp/video/upload/v1688108702/PERKEMBANGAN_SOSIAL_ANAK_USIA_8_TAHUN_SUDAH_SESUAIKAH__zfi0om.mp4",
                        "https://res.cloudinary.com/dieh1bqjp/video/upload/v1688108719/STRICT_PARENTING_BOLEHKAN_DITERAPKAN_KEPADA_ANAK_flx6qj.mp4",

                },
                new String[] {
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688649760/kids-play-outdoors_gdkept.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688649899/20140321_095921_5_jevdof.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650025/4.-Tahap-Perkembangan-Anak-Usia-9-10-Tahun_Halodoc_otvgsd.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650118/098743900_1656143781-Parenting_is2loc.jpg",
                },
                new String[] {
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650369/13_cavjwy.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650370/14_waoedp.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650370/15_ps1lds.jpg",
                        "https://res.cloudinary.com/dlmjnzi46/image/upload/v1688650371/16_darsv3.jpg",
                }
        );
    }

    private static List<Video> setupVideos(String[] titles, String[] description, String[] videoUrls, String[] bgImageUrls, String[] cardImageUrls) {
        List<Video> videoList = new ArrayList<>();
        for (int index = 0; index < titles.length; ++index) {
            videoList.add(
                    buildVideoInfo(
                            titles[index],
                            description[index],
                            videoUrls[index],
                            cardImageUrls[index],
                            bgImageUrls[index]
                    )
            );
        }
        return videoList;
    }
}
