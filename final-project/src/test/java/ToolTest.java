import com.lendingcatalog.model.Tool;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToolTest {
    @Test
    void matchesName_ShouldReturnTrue_WhenNameMatches() {
        Tool tool = new Tool("123", "Hammer", "Craftsman", 1);
        assertTrue(tool.matchesName("Hammer"));
    }

    @Test
    void matchesName_ShouldReturnFalse_WhenNameDoesNotMatch() {
        Tool tool = new Tool("123", "Hammer", "Craftsman", 1);
        assertFalse(tool.matchesName("Screwdriver"));
    }

    @Test
    void matchesCreator_ShouldReturnTrue_WhenManufacturerMatches() {
        Tool tool = new Tool("123", "Hammer", "Craftsman", 1);
        assertTrue(tool.matchesCreator("Craftsman"));
    }

    @Test
    void matchesCreator_ShouldReturnFalse_WhenManufacturerDoesNotMatch() {
        Tool tool = new Tool("123", "Hammer", "Craftsman", 1);
        assertFalse(tool.matchesCreator("Different Manufacturer"));
    }

    @Test
    public void matchesYear_ShouldReturnFalse_ForTool() {
        Tool tool = new Tool("123", "Hammer", "Craftsman", 1);
        assertFalse(tool.matchesYear(1));
    }

    @Test
    void matchesYear_ShouldReturnFalse_WhenQuantityDoesNotMatch() {
        Tool tool = new Tool("123", "Hammer", "Craftsman", 1);
        assertFalse(tool.matchesYear(2));
    }

}
