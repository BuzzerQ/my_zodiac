package com.example.my_zodiac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ramal extends AppCompatActivity {

    String get_Tanggal, get_Nama;
    TextView tvZodiac, tvBulan, tvIsiZodiac, tvIsiBulan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramal);

        tvZodiac = findViewById(R.id.tv_zodiac);
        tvIsiZodiac = findViewById(R.id.tv_isizodiac);

        Bundle b = getIntent().getExtras();

        get_Nama = b.getString("parseNama");
        get_Tanggal = b.getString("parseTanggal");

        String[] items1 = get_Tanggal.split("-");
        String date1=items1[0];
        String month=items1[1];
        String year=items1[2];

        if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 12) || (Integer.parseInt(date1)<=19 && Integer.parseInt(month) == 1)){
            tvZodiac.setText("Capricorn");
            tvIsiZodiac.setText("Orang yang lahir pada tanggal antara 21 Desember sampai 19 Januari berada di bawah pengaruh zodiak Capricorn, yang berlambang kambing. Orang yang berzodiak Capricorn mengutamakan kesuksesan, status, posisi, reputasi, loyalitas, konsentrasi, pemecahan masalah, bertanggung jawab, memperlihatkan kebijaksanaan, dan keseriusan belajar melalui pengalaman. Namun, ada kalanya orang berzodiak Capricorn cenderung bersikap memandang buruk (pesimis), selalu terpaksa, membebani, takut menghadapi hambatan, memperlihatkan batasan, kurang simpati, terlalu khawatir, dan pemikiran sempit. Capricorn termasuk dalam kategori kardinal, yaitu aktif. Dengan kualitas ini Anda dianggap baik untuk memulai setiap proyek baru. Lambang-lambang yang termasuk dalam kategori kardinal selain Capricorn adalah Aries, Cancer dan Libra.");
        }

        else if ((Integer.parseInt(date1)>20 && Integer.parseInt(month) == 1) || (Integer.parseInt(date1)<=18 && Integer.parseInt(month) == 2)){
            tvZodiac.setText("Aquarius");
            tvIsiZodiac.setText("Orang yang lahir pada tanggal antara 20 Januari sampai 18 Febuari berada di bawah pengaruh zodiak Aquarius, yang berlambang gelombang (alur air). Orang Aquarius tertarik dengan petualangan, berjiwa kemanusiaan, ingin tahu, ada semangat berontak, bersikap spontan, progesif, persahabatan, hak asasi, kelompok, dan mampu memberi manfaat untuk sekitar. Namun, ada kalanya Aquarius menghadapi gangguan, tak bisa diharapkan, suka membantah, memberontak, tak lengkap, perilaku salah, tak kosisten, perangai radikal, kurang metode, dan mendatangkan bencana. Aquarius termasuk dalam kategori tetap, yaitu termasuk stabilitas, ketabahan, ketahanan, dan kesempurnaan. Dengan kualitas ini Aquarius baik untuk memastikan sesuatu berjalan lancar atau berhasil. Lambang – lambang yang termasuk dalam kategori tetap selain Aquarius adalah Taurus, Leo dan Scorpio");
        }

        else if ((Integer.parseInt(date1)>19 && Integer.parseInt(month) == 2) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 3)){
            tvZodiac.setText("Pisces");
            tvIsiZodiac.setText("Orang yang lahir antara tanggal 19 Febuari sampai 20 Maret dikatakan bernaung di bawah zodiak Pisces, yang berlambang ikan. Pisces mengutamakan cinta universal, bersifat manja, selalu mencari ilham, memperlihatkan kepercayaan, ada kesepahaman, berjiwa puitis, menyukai musik, beragama, bersifat setia, mampu menghibur diri, mengutamakan kerohanian, dan tidak mudah mengaku kalah. Namun, ada kalanya Pisces merasa bingung, bersalah, mudah mengaku kalah, mudah kecewa, khawatir, risau, terlibat dalam penipuan, ketagihan, dan mudah menurut kemauan hati. Pisces termasuk dalam kategori variabel, yaitu mudah mengalami daya perubahan, daya adaptasi dan daya keseimbangan. Dengan kategori variabel ini, Pisces adalah kreatif meskipun tidak selalu praktis. Lambang-lambang yang termasuk dalam kategori fleksibel selain Pisces adalah Gemini, Virgo dan Sagitarius.");
        }

        else if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 3) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 4)){
            tvZodiac.setText("Aries");
            tvIsiZodiac.setText("Orang yang lahir pada tanggal antara 21 Maret sampai 20 April dikatakan bernaung di bawah zodiak Aries, yang berlambang Biri-biri jantan. Dengan demikian, Aries seorang yang berani, yakin, inisiatif, mengutamakan tindakan, ada pertahanan diri, ada rasa merintis, ada daya juang, dan pencinta / memperjuangkan nasib. Namun, ada kalanya Aries ini terlalu pemikir, ada kekasaran, kesombongan diri, gemar memicu permusuhan, agresif, hasil kerja tak sempurna, dan ada kelemahan. Aries termasuk dalam kategori kardinal, yaitu aktif. Dengan kualitas ini Aries dianggap baik untuk memulai setiap proyek baru. Lambang-lambang yang termasuk dalam kategori kardinal selain Aries adalah Capricorn, Cancer dan Libra.");
        }

        else if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 4) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 5)){
            tvZodiac.setText("Taurus");
            tvIsiZodiac.setText("Orang yang lahir pada tanggal antara 21 April sampai 20 Mei dikatakan bernaung di bawah zodiak Taurus, yang berlambang Lembu Jantan. Dengan demikian, Taurus mengutamakan kekayaan, ketinggian spiritual, kaut daya rasa, loyalitas, gemar berpelesiran, kesuburan, terlalu praktis, murah rezeki dan ketabahan. Walau bagaimana pun, ada kalanya Taurus bersikap terlalu kebendaan, terlalu mengekang, keras hati, suka menurut rasa hati dan buntu pikiran. Taurus termasuk dalam kategori tetap, yaitu termasuk stabilitas, daya ketabahan, daya tahan, dan daya kesempurnaan. Dengan kualitas ini Taurus baik untuk mempastikan sesuatu berjalan lancar atau berhasil. Lambang-lambang yang termasuk dalam kategori tetap selain Taurus adalah Aquarius, Leo dan Scorpio");
        }

        else if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 5) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 6)){
            tvZodiac.setText("Gemini");
            tvIsiZodiac.setText("Orang yang lahir pada tanggal antara 21 Mei sampai 20 Juni dikatakan bernaung di bawah zodiak Gemini, yang berlambang Saudara Kembar. Dengan demikian, Gemini terampil berkomunikasi, suka bepergian, serbaguna, cerdas, ada kekuatan berbicara, mampu menulis, kedekatan pada sanak saudara dan tetangga, gemar migrasi, dan bersikap terbuka. Namun, ada kalanya Gemini bersikap hanya suka sekejap saja, bersikap keanak-anakan, gugup, suka bermuka dua, berbicara kosong, tak lengkap dan suka berpura-pura. Gemini termasuk dalam kategori variabel, yaitu mudah mengalami daya perubahan, daya adaptasi dan daya keseimbangan. Dengan kategori variabel ini, Gemini adalah kreatif meskipun tidak selalu praktis. Lambang-lambang yang termasuk dalam kategori bervariasi selain Gemini adalah Pisces, Virgo dan Sagitarius.");
        }

        else if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 6) || (Integer.parseInt(date1)<=21 && Integer.parseInt(month) == 8)){
            tvZodiac.setText("Cancer");
            tvIsiZodiac.setText("Orang yang lahir pada tanggal antara 21 Juni sampai 20 Juli dikatakan bernaung di bawah zodiak Cancer, yang berlambang Kepiting. Dengan demikian, Cancer menyukai rumah tangga, keluarga, kesehatan, makanan, ada rasa simpati, memberi perlindungan, agak sensitif, punya kesabaran, kejujuran, dan kecerdasan. Namun, ada kalanya Cancer bersikap kekanak-kanakan, berbolak-balik, berpura-pura, tidak aman, terlalu bertahan dan takut pada perpisahan. Cancer termasuk dalam kategori kardinal, yaitu aktif. Dengan kualitas ini Cancer dianggap baik untuk memulai setiap proyek baru. Lambang-lambang yang termasuk dalam kategori kardinal selain Cancer adalah Aries, Capricorn dan Libra.");
        }

        else if ((Integer.parseInt(date1)>21 && Integer.parseInt(month) == 7) || (Integer.parseInt(date1)<=21 && Integer.parseInt(month) == 8)){
            tvZodiac.setText("Leo");
            tvIsiZodiac.setText("Orang yang lahir pada tanggal antara 21 Juli sampai 21 Agustus dikatakan bernaung di bawah zodiak Leo, yang berlambang Singa. Anda mengutamakan rasa cinta, ramah, bersifat pemurah, ada daya kepemimpinan, menonjolkan kemegahan, selalu hidup, menyoroti keagungan, keberanian, kemampuan, dekat dengan anak-anak, berbakat dan suka pada hiburan. Walau bagaimana pun, ada kalanya Leo ini kerap menunjukkan ego, banyak bicara, memperlihatkan sifat kekuasaan, suka pamer, mengejar kemewahan, dan memenuhi komplek rendah diri dan bangga diri. Leo termasuk dalam kategori tetap, yaitu termasuk stabilitas, ketabahan, ketahanan, dan kesempurnaan. Dengan kualitas ini Anda akan baik untuk mempastikan sesuatu berjalan lancar atau berhasil. Lambang-lambang yang termasuk dalam kategori tetap selain Anda adalah Taurus, Aquarius dan Scorpio.");
        }

        else if ((Integer.parseInt(date1)>22 && Integer.parseInt(month) == 8) || (Integer.parseInt(date1)<=22 && Integer.parseInt(month) == 9)){
            tvZodiac.setText("Virgo");
            tvIsiZodiac.setText("Orang yang lahir pada tanggal antara 22 Agustus hingga 22 September dikatakan bernaung di bawah zodiak Virgo, yang berlambang Seorang Gadis. Dengan demikian, Virgo suka pada kerja, hasil kerja sempurna, punya pahlawan diri, suci, mengutamakan kesehatan, ada kesadaran, memberikan konsentrasi berdisiplin, praktis, siap melayani dan komprehensif. Namun, ada kalanya Virgo merasa khawatir, cerewet, berpandangan sempit, terlalu tertib, suka mengeluh, tidak mudah mengaku kalah, dan ada suka mengkritik. Virgo termasuk dalam kategori variabel, yaitu mudah mengalami daya perubahan, daya adaptasi dan daya keseimbangan. Dengan kategori variabel ini, Virgo adalah zodiak kreatif meskipun tidak selalu praktis. Lambang-lambang yang termasuk dalam kategori bervariasi selain Virgo adalah Gemini, Pisces dan Sagitarius.");
        }

        else if ((Integer.parseInt(date1)>23 && Integer.parseInt(month) == 9) || (Integer.parseInt(date1)<=22 && Integer.parseInt(month) == 10)){
            tvZodiac.setText("Libra");
            tvIsiZodiac.setText("Orang yang lahir pada tanggal antara 23 September sampai 22 Oktober dikatakan bernaung di bawah zodiak Libra, yang berlambang Alat Penimbang (Dacin). Dengan demikian, orang yang berzodiak Libra biasanya berciri-ciri harmonis, seimbang, menyukai pernikahan, mendapati perhubungan, mengutamakan kesetaraan, aliansi, diplomasi, berseni, suka membantu, selalu dalam keadaan ceria, dapat menjadi pasangan yang ideal dan menyukai keadilan. Namun, ada kalanya Libra bersikap bolak-balik, pura-pura, tidak jujur, tujuan kurang tegas, atau tindakan kurang seimbang. Libra termasuk dalam kategori kardinal, yaitu aktif (berprinsip memulai sesuatu). Dengan kualitas ini Libra dianggap baik untuk merangsang dan memulai setiap proyek baru. Lambang-lambang yang termasuk dalam kategori kardinal selain Libra adalah Aries, Cancer dan Capricorn.");
        }

        else if ((Integer.parseInt(date1)>23 && Integer.parseInt(month) == 10) || (Integer.parseInt(date1)<=22 && Integer.parseInt(month) == 11)){
            tvZodiac.setText("Scorpio");
            tvIsiZodiac.setText("Orang yang lahir pada tanggal antara 23 Oktober sampai 22 November dikatakan bernaung di bawah zodiak Scorpio, yang berlambang kalajengking. Scorpio memiliki kemewahan, kreatif, ada keinginan yang kuat, punya stamina, daya sensual yang tinggi dan ada bakat menyembuhkan. Walau bagaimana pun, ada kalanya Scorpio mudah menaruh rasa cemburu, suka menuntut bela, suka ‘membinasakan diri’, ekstrim, fanatik, tamak dan berdaya untuk menyerang. Scorpio termasuk dalam kategori tetap, yaitu termasuk stabilitas, ketabahan, ketahanan, dan kesempurnaan. Dengan kualitas ini Scorpio akan baik untuk memastikan sesuatu berjalan lancar atau berhasil. Lambang-lambang yang termasuk dalam kategori tetap selain Scorpio adalah Taurus, Leo dan Aquarius.");
        }

        else if ((Integer.parseInt(date1)>23 && Integer.parseInt(month) == 11) || (Integer.parseInt(date1)<=20 && Integer.parseInt(month) == 12)){
            tvZodiac.setText("Sagitarius");
            tvIsiZodiac.setText("Orang yang lahir pada tanggal antara 23 November sampai 20 Desember dikatakan bernaung di bawah zodiak Sagitarius, yang berlambang Pemanah. Sagitarius suka minat belajar, bersikap optimis, pemanjat, pemahaman diri, bercita-cita tinggi, memiliki hati nurani, berpegang pada agama, psikologi, suka pada kesenangan, bijaksana, selalu ada keberuntungan, gemar eksplorasi dan ada berbagai impian. Namun, ada kalanya Sagitarius berada dalam kelalaian, tidak mematuhi hukum, berada dalam kegelisahan, pembazir, terlalu menurut kehendak hati, tidak jujur dan tidak bertanggung jawab. Sagitarius termasuk dalam kategori variabel, yaitu mudah mengalami daya perubahan, daya adaptasi dan daya keseimbangan. Dengan kategori variabel ini, Sagitarius adalah kreatif meskipun tidak selalu praktis. Lambang-lambang yang termasuk dalam kategori bervariasi selain Sagitarius adalah Gemini, Virgo dan Pisces.");
        }

    }
}
