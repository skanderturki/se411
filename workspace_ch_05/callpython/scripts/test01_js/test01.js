import {RecursiveCharacterTextSplitter} from 'langchain/text_splitter';
import fs from 'node:fs';
import config from 'dotenv';
config();

try {
  fs.readFile('./info.txt', 'utf8', async (err, data) => {
    if (err) {
      console.error(err);
      return;
    }

    const splitter = new RecursiveCharacterTextSplitter({
      chunkSize: 500, // Split each document into chunks of 1000 characters
      maxDepth: 3, // Recursively split each chunk into sub-chunks up to a maximum depth of 3
      separators: ['\n\n', '\n', ' ', ''], //
      chunkOverlap: 50
    });

    const db_api = process.env.SUPABASE_API;
    const db_url = process.env.SUPABASE_URL;

    const outputs = await splitter.createDocuments([data]);
    console.log(outputs);
  });
  
} catch (e) {
  console.error("Error fetching data:", e);
}
