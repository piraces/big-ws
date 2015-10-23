package translator.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import translator.Application;
import translator.domain.TranslatedText;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class TranslatorServiceTest {

    @Autowired
    TranslatorService translatorService;
    @Test
    public void translateTest() throws Exception {
        TranslatedText translatedText = translatorService.translate("en", "es", "The greatest glory in living lies "
        	+ "not in never falling, but in rising every time we fall.");
        assertEquals("La mayor gloria en la vida no consiste en nunca caer, "
        	+ "sino en levantarnos cada vez que caemos.",translatedText.getTranslation());
    }

}
