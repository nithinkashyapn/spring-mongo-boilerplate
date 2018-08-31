package code.nithin.endpoints;

import code.nithin.models.Asset;
import code.nithin.repositories.AssetRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/assets")
public class AssetEndpoints {
    @Autowired
    private AssetRepository assetRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Asset> getAllAssets(){
        return assetRepository.findAll();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public void insertAnAsset() {

        Asset asset = new Asset(new ObjectId(), 1, 123, "https://nithin.com");
        assetRepository.save(asset);
    }
}
