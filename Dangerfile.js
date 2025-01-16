import { warn, fail, message } from "danger";

// Example: Warn if there are no PR descriptions
if (!danger.github.pr.body || danger.github.pr.body.length === 0) {
  warn("Please include a description of your PR changes.");
}